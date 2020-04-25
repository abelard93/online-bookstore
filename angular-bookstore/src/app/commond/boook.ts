export class Book {
    //Ici il faut s'assurer que les propriete quOn va definir ici sont les memes que qu'on 
    //defini dans SpringBook:

    sku: string;
    name: string;
    description: string;
    unitPrice: number;
    imageUrl: string;
    active: boolean;
    unitsInStock: number;
    createdOn: Date;
    updatedOn: Date;
}
