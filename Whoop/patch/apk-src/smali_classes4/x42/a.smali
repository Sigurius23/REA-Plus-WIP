.class public final Lx42/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lx42/a;",
        "",
        "Ly42/j;",
        "puffinManager",
        "Lgt0/e;",
        "firmwareUpdateApi",
        "Lf52/a;",
        "hpsSubmitter",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ly42/j;Lgt0/e;Lf52/a;Ltr2/n;)V",
        "Lbc3/c0;",
        "scope",
        "Ll83/a0;",
        "d",
        "(Lbc3/c0;)V",
        "a",
        "Ly42/j;",
        "b",
        "Lgt0/e;",
        "c",
        "Lf52/a;",
        "Ltr2/n;",
        "puffin_release"
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
.field private final a:Ly42/j;

.field private final b:Lgt0/e;

.field private final c:Lf52/a;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Ly42/j;Lgt0/e;Lf52/a;Ltr2/n;)V
    .locals 1

    const-string v0, "puffinManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareUpdateApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hpsSubmitter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lx42/a;->a:Ly42/j;

    .line 3
    iput-object p2, p0, Lx42/a;->b:Lgt0/e;

    .line 4
    iput-object p3, p0, Lx42/a;->c:Lf52/a;

    .line 5
    iput-object p4, p0, Lx42/a;->d:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Ly42/j;Lgt0/e;Lf52/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "BatteryPackHpsMonitor"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lx42/a;-><init>(Ly42/j;Lgt0/e;Lf52/a;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lx42/a;)Lgt0/e;
    .locals 0

    iget-object p0, p0, Lx42/a;->b:Lgt0/e;

    return-object p0
.end method

.method public static final synthetic b(Lx42/a;)Lf52/a;
    .locals 0

    iget-object p0, p0, Lx42/a;->c:Lf52/a;

    return-object p0
.end method

.method public static final synthetic c(Lx42/a;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lx42/a;->d:Ltr2/n;

    return-object p0
.end method


# virtual methods
.method public final d(Lbc3/c0;)V
    .locals 5

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx42/a;->a:Ly42/j;

    invoke-virtual {v0}, Ly42/j;->e()Lec3/t1;

    move-result-object v0

    new-instance v1, Lx42/a$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lx42/a$c;-><init>(Lx42/a;Lq83/d;)V

    new-instance v3, Lec3/j1;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v4}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    new-instance v0, Lx42/a$d;

    invoke-direct {v0, p0, v2}, Lx42/a$d;-><init>(Lx42/a;Lq83/d;)V

    sget v1, Lec3/w0;->a:I

    invoke-static {v1, v0, v3}, Lec3/v;->E(ILc93/m;Lec3/l;)Lec3/l;

    move-result-object v0

    new-instance v1, Lx42/a$a;

    invoke-direct {v1, v0}, Lx42/a$a;-><init>(Lec3/l;)V

    new-instance v0, Lx42/a$b;

    invoke-direct {v0, v1, p0}, Lx42/a$b;-><init>(Lec3/l;Lx42/a;)V

    new-instance v1, Lx42/a$e;

    invoke-direct {v1, p0, v2}, Lx42/a$e;-><init>(Lx42/a;Lq83/d;)V

    new-instance v2, Lec3/j1;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    invoke-static {v2, p1}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method
