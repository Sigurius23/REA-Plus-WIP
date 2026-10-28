.class public final Lch0/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R+\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR+\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u0007\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0006\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R+\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u0007\u001a\u0004\u0008\u0015\u0010\u0010\"\u0004\u0008\u001c\u0010\u0012R+\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\u0007\u001a\u0004\u0008\u000e\u0010\u0010\"\u0004\u0008\u001e\u0010\u0012R+\u0010!\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0007\u001a\u0004\u0008\u001b\u0010\u0010\"\u0004\u0008 \u0010\u0012\u00a8\u0006\""
    }
    d2 = {
        "Lch0/s0;",
        "",
        "<init>",
        "()V",
        "",
        "<set-?>",
        "a",
        "Lp1/c1;",
        "e",
        "()I",
        "k",
        "(I)V",
        "viewportHeightPx",
        "",
        "b",
        "f",
        "()F",
        "l",
        "(F)V",
        "viewportTopY",
        "",
        "c",
        "Z",
        "()Z",
        "g",
        "(Z)V",
        "hasBeenVisible",
        "d",
        "i",
        "latestUserMessageTopY",
        "h",
        "latestAssistantMessageTopY",
        "j",
        "messagesBottomY",
        "bot_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lp1/c1;

.field private final b:Lp1/c1;

.field private c:Z

.field private final d:Lp1/c1;

.field private final e:Lp1/c1;

.field private final f:Lp1/c1;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lch0/s0;->a:Lp1/c1;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lch0/s0;->b:Lp1/c1;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lch0/s0;->d:Lp1/c1;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, p0, Lch0/s0;->e:Lp1/c1;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lch0/s0;->f:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lch0/s0;->c:Z

    return v0
.end method

.method public final b()F
    .locals 1

    iget-object v0, p0, Lch0/s0;->e:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public final c()F
    .locals 1

    iget-object v0, p0, Lch0/s0;->d:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public final d()F
    .locals 1

    iget-object v0, p0, Lch0/s0;->f:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public final e()I
    .locals 1

    iget-object v0, p0, Lch0/s0;->a:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final f()F
    .locals 1

    iget-object v0, p0, Lch0/s0;->b:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public final g(Z)V
    .locals 0

    iput-boolean p1, p0, Lch0/s0;->c:Z

    return-void
.end method

.method public final h(F)V
    .locals 1

    iget-object v0, p0, Lch0/s0;->e:Lp1/c1;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final i(F)V
    .locals 1

    iget-object v0, p0, Lch0/s0;->d:Lp1/c1;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final j(F)V
    .locals 1

    iget-object v0, p0, Lch0/s0;->f:Lp1/c1;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final k(I)V
    .locals 1

    iget-object v0, p0, Lch0/s0;->a:Lp1/c1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final l(F)V
    .locals 1

    iget-object v0, p0, Lch0/s0;->b:Lp1/c1;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method
