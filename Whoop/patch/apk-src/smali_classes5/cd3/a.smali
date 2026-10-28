.class public final Lcd3/a;
.super Lcd3/c;
.source "SourceFile"


# instance fields
.field public final a:Lwc3/c;


# direct methods
.method public constructor <init>(Lwc3/c;)V
    .locals 1

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcd3/a;->a:Lwc3/c;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lwc3/c;
    .locals 1

    const-string v0, "typeArgumentsSerializers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcd3/a;->a:Lwc3/c;

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcd3/a;

    if-eqz v0, :cond_0

    check-cast p1, Lcd3/a;

    iget-object p1, p1, Lcd3/a;->a:Lwc3/c;

    iget-object v0, p0, Lcd3/a;->a:Lwc3/c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcd3/a;->a:Lwc3/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
