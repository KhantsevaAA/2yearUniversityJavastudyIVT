package org.example.lab1.task2;


class FabricMethodService {
    public void exec() {
        //Configuration configuration = Configuration.initWeb();
        // удалить предыдущую строку и расскоментить следующую, чтоб получить в выводе render MobButton, а не render WebButton  
         Configuration configuration = Configuration.initMob();

        Dialog dialog=null;
        switch (configuration.getPlatform()) {
            case Configuration.WEB:
                dialog = new WebDialog();
                break;
            case Configuration.MOB:
                dialog = new MobDialog();
                break;
            default:
                throw new IllegalArgumentException("Неизвестный тип платформы");
        }
        dialog.render();
    }
}