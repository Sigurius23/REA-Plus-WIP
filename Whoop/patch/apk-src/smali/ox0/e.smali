.class public final Lox0/e;
.super Landroidx/lifecycle/w1;
.source "SourceFile"

# interfaces
.implements Lof3/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0015\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u0004J\r\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u0004R\u001b\u0010\u0011\u001a\u00020\u000c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u000e\u001a\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001d\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lox0/e;",
        "Landroidx/lifecycle/w1;",
        "Lof3/a;",
        "<init>",
        "()V",
        "",
        "level",
        "Ll83/a0;",
        "t",
        "(B)V",
        "n",
        "o",
        "Lu92/d;",
        "w",
        "Ll83/h;",
        "p",
        "()Lu92/d;",
        "sharedPrefs",
        "Lci2/b;",
        "x",
        "r",
        "()Lci2/b;",
        "whoopStrapProvider",
        "Lec3/p1;",
        "Lox0/d;",
        "y",
        "Lec3/p1;",
        "_uiState",
        "Lec3/f2;",
        "z",
        "Lec3/f2;",
        "q",
        "()Lec3/f2;",
        "uiState",
        "debug-tools_release"
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
.field private final w:Ll83/h;

.field private final x:Ll83/h;

.field private final y:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final z:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    new-instance v0, Lvf3/c;

    const-string v1, "mainPrefs"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lox0/e$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v0, v3}, Lox0/e$c;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lox0/e;->w:Ll83/h;

    new-instance v0, Lox0/e$d;

    invoke-direct {v0, p0, v3, v3}, Lox0/e$d;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lox0/e;->x:Ll83/h;

    sget-object v0, Lox0/d$c;->a:Lox0/d$c;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lox0/e;->y:Lec3/p1;

    invoke-static {v0}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v0

    iput-object v0, p0, Lox0/e;->z:Lec3/f2;

    return-void
.end method

.method public static final synthetic g(Lox0/e;)Lu92/d;
    .locals 0

    invoke-direct {p0}, Lox0/e;->p()Lu92/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Lox0/e;)Lci2/b;
    .locals 0

    invoke-direct {p0}, Lox0/e;->r()Lci2/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Lox0/e;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lox0/e;->y:Lec3/p1;

    return-object p0
.end method

.method private final p()Lu92/d;
    .locals 1

    iget-object v0, p0, Lox0/e;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu92/d;

    return-object v0
.end method

.method private final r()Lci2/b;
    .locals 1

    iget-object v0, p0, Lox0/e;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lci2/b;

    return-object v0
.end method


# virtual methods
.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method

.method public final n()V
    .locals 4

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lox0/e$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lox0/e$a;-><init>(Lox0/e;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final o()V
    .locals 2

    iget-object v0, p0, Lox0/e;->y:Lec3/p1;

    sget-object v1, Lox0/d$c;->a:Lox0/d$c;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void
.end method

.method public final q()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lox0/e;->z:Lec3/f2;

    return-object v0
.end method

.method public final t(B)V
    .locals 3

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lox0/e$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lox0/e$b;-><init>(Lox0/e;BLq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
