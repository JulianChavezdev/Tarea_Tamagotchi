void main() {
    Tamagotchi tama1 = new Tamagotchi();
    System.out.println("Hola!, Soy tu tamagotchi");
    System.out.println("Puedes Alimentarme, Jugar conmigo o Dormirme");
    Scanner sc1 = new Scanner(System.in);
    String accion1 = sc1.nextLine();
    if (accion1.equals("Alimentar")) {
        accion1 = tama1.eat();
        System.out.println(tama1.status());
    } else if (accion1.equals("Jugar")) {
        accion1 = tama1.play();
        System.out.println(tama1.status());
    } else if (accion1.equals("Dormir")) {
        accion1 = tama1.sleep();
        System.out.println(tama1.status());
    } else {
        System.out.println("Esta opcion no existe :/");
    }
    System.out.println(tama1);
    System.out.println("¿Que mas quieres hacer?");
    Scanner sc2 = new Scanner(System.in);
    String accion2 = sc2.nextLine();
    if (accion2.equals("Alimentar")) {
        accion2 = tama1.eat();
        System.out.println(tama1.status());
    } else if (accion2.equals("Jugar")) {
        accion2 = tama1.play();
        System.out.println(tama1.status());
    } else if (accion2.equals("Dormir")) {
        accion2 = tama1.sleep();
        System.out.println(tama1.status());
    } else {
        System.out.println("Esta opcion no existe :/");
    }
    System.out.println(tama1);

    System.out.println("¿Que mas quieres hacer?");
    Scanner sc3 = new Scanner(System.in);
    String accion3 = sc3.nextLine();

    if (accion3.equals("Alimentar")) {
        accion3 = tama1.eat();
        System.out.println(tama1.status());
    } else if (accion3.equals("Jugar")) {
        accion3 = tama1.play();
        System.out.println(tama1.status());
    } else if (accion3.equals("Dormir")) {
        accion3 = tama1.sleep();
        System.out.println(tama1.status());
    } else {
        System.out.println("Esta opcion no existe :/");
    }
    System.out.println(tama1);
}


