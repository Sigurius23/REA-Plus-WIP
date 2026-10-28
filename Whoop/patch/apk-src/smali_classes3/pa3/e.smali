.class public final Lpa3/e;
.super Lal/a;
.source "SourceFile"


# instance fields
.field public final synthetic y:I

.field public final synthetic z:Loa3/n;


# direct methods
.method public synthetic constructor <init>(Loa3/n;I)V
    .locals 0

    iput p2, p0, Lpa3/e;->y:I

    iput-object p1, p0, Lpa3/e;->z:Loa3/n;

    const/4 p1, 0x5

    invoke-direct {p0, p1}, Lal/a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final G0([Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lpa3/e;->y:I

    packed-switch v0, :pswitch_data_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lpa3/e;->z:Loa3/n;

    check-cast v0, Lpa3/d;

    iget-object v0, v0, Lpa3/d;->x:Lpa3/f;

    iput-object p1, v0, Lpa3/f;->H:[Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Argument for @NotNull parameter \'result\' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lpa3/e;->z:Loa3/n;

    check-cast v0, Lpa3/d;

    iget-object v0, v0, Lpa3/d;->x:Lpa3/f;

    iput-object p1, v0, Lpa3/f;->E:[Ljava/lang/String;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Argument for @NotNull parameter \'data\' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Lpa3/e;->z:Loa3/n;

    check-cast v0, Lpa3/d;

    iget-object v0, v0, Lpa3/d;->x:Lpa3/f;

    iput-object p1, v0, Lpa3/f;->z:[Ljava/lang/String;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Argument for @NotNull parameter \'data\' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
