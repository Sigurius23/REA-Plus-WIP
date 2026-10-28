.class public final Lz2/i;
.super Lv63/c;
.source "SourceFile"


# instance fields
.field public final a:Lz2/h;

.field public final b:Lp1/k1;


# direct methods
.method public constructor <init>(Lz2/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/i;->a:Lz2/h;

    const/4 p1, 0x0

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lz2/i;->b:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final c(Lz2/h;)Z
    .locals 1

    iget-object v0, p0, Lz2/i;->a:Lz2/h;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final e(Lz2/h;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz2/i;->a:Lz2/h;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Check failed."

    invoke-static {p1}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lz2/i;->b:Lp1/k1;

    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    :cond_1
    return-object p1
.end method
