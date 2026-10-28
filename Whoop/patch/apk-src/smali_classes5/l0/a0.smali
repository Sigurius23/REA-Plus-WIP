.class public final Ll0/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/c;


# instance fields
.field public final w:Lkotlin/jvm/functions/Function1;

.field public x:Ll0/b2;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll0/a0;->w:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ll0/a0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ll0/a0;

    iget-object p1, p1, Ll0/a0;->w:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll0/a0;->w:Lkotlin/jvm/functions/Function1;

    if-ne p1, v1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final h(Lz2/g;)V
    .locals 1

    sget-object v0, Ll0/f;->d:Lz2/h;

    invoke-interface {p1, v0}, Lz2/g;->a(Lz2/h;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll0/b2;

    iget-object v0, p0, Ll0/a0;->x:Ll0/b2;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Ll0/a0;->x:Ll0/b2;

    iget-object v0, p0, Ll0/a0;->w:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ll0/a0;->w:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
