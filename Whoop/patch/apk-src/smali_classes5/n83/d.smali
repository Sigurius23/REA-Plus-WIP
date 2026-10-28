.class public final Ln83/d;
.super Li6/c;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Ld93/a;


# instance fields
.field public final synthetic E:I


# direct methods
.method public constructor <init>(Ln83/f;I)V
    .locals 0

    iput p2, p0, Ln83/d;->E:I

    const-string p2, "map"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/c;->z:Ljava/lang/Object;

    const/4 p2, -0x1

    iput p2, p0, Li6/c;->x:I

    iget p1, p1, Ln83/f;->H:I

    iput p1, p0, Li6/c;->y:I

    invoke-virtual {p0}, Li6/c;->c()V

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ln83/d;->E:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Li6/c;->b()V

    iget v0, p0, Li6/c;->w:I

    iget-object v1, p0, Li6/c;->z:Ljava/lang/Object;

    check-cast v1, Ln83/f;

    iget v2, v1, Ln83/f;->F:I

    if-ge v0, v2, :cond_0

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Li6/c;->w:I

    iput v0, p0, Li6/c;->x:I

    iget-object v0, v1, Ln83/f;->x:[Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v1, p0, Li6/c;->x:I

    aget-object v0, v0, v1

    invoke-virtual {p0}, Li6/c;->c()V

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_0
    invoke-virtual {p0}, Li6/c;->b()V

    iget v0, p0, Li6/c;->w:I

    iget-object v1, p0, Li6/c;->z:Ljava/lang/Object;

    check-cast v1, Ln83/f;

    iget v2, v1, Ln83/f;->F:I

    if-ge v0, v2, :cond_1

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Li6/c;->w:I

    iput v0, p0, Li6/c;->x:I

    iget-object v1, v1, Ln83/f;->w:[Ljava/lang/Object;

    aget-object v0, v1, v0

    invoke-virtual {p0}, Li6/c;->c()V

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_1
    invoke-virtual {p0}, Li6/c;->b()V

    iget v0, p0, Li6/c;->w:I

    iget-object v1, p0, Li6/c;->z:Ljava/lang/Object;

    check-cast v1, Ln83/f;

    iget v2, v1, Ln83/f;->F:I

    if-ge v0, v2, :cond_2

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Li6/c;->w:I

    iput v0, p0, Li6/c;->x:I

    new-instance v2, Ln83/e;

    invoke-direct {v2, v1, v0}, Ln83/e;-><init>(Ln83/f;I)V

    invoke-virtual {p0}, Li6/c;->c()V

    return-object v2

    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
