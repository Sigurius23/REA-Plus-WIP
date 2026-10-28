.class public abstract Llb3/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[Lj93/z;

.field public static final b:Ld0/o2;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Llb3/h;

    const-string v2, "annotationsAttribute"

    const-string v3, "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    new-array v2, v4, [Lj93/z;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    sput-object v2, Llb3/h;->a:[Lj93/z;

    sget-object v0, Llb3/k0;->x:Lwe/o;

    const-class v2, Llb3/g;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "kClass"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ld0/o2;

    invoke-interface {v1}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lwe/o;->I(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x5

    invoke-direct {v2, v0, v1}, Ld0/o2;-><init>(II)V

    sput-object v2, Llb3/h;->b:Ld0/o2;

    return-void
.end method

.method public static final a(Llb3/k0;)Ls93/i;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb3/h;->a:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    sget-object v1, Llb3/h;->b:Ld0/o2;

    invoke-virtual {v1, p0, v0}, Ld0/o2;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Llb3/g;

    if-eqz p0, :cond_1

    iget-object p0, p0, Llb3/g;->a:Ls93/i;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    sget-object p0, Ls93/g;->a:Ls93/f;

    return-object p0
.end method
