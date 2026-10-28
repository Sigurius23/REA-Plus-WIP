.class public final Llb3/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ls93/i;


# direct methods
.method public constructor <init>(Ls93/i;)V
    .locals 1

    const-string v0, "annotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb3/g;->a:Ls93/i;

    return-void
.end method

.method public static b()Lj93/d;
    .locals 2

    const-class v0, Llb3/g;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Llb3/g;)Llb3/g;
    .locals 2

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Llb3/g;

    iget-object v1, p0, Llb3/g;->a:Ls93/i;

    iget-object p1, p1, Llb3/g;->a:Ls93/i;

    invoke-static {v1, p1}, Ls93/k;->d(Ls93/i;Ls93/i;)Ls93/i;

    move-result-object p1

    invoke-direct {v0, p1}, Llb3/g;-><init>(Ls93/i;)V

    return-object v0
.end method

.method public final c(Llb3/g;)Llb3/g;
    .locals 0

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Llb3/g;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Llb3/g;

    iget-object p1, p1, Llb3/g;->a:Ls93/i;

    iget-object v0, p0, Llb3/g;->a:Ls93/i;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Llb3/g;->a:Ls93/i;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
