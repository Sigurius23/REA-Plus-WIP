.class public final Lh20/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lec3/r1;

.field public final b:Ljava/lang/String;

.field public final c:Le30/a;

.field public final d:Le30/a;

.field public final e:Lec3/h2;

.field public final f:Lec3/h2;


# direct methods
.method public constructor <init>(Ln8/a;Lec3/r1;Ljava/lang/String;Le30/a;Le30/a;)V
    .locals 1

    const-string v0, "merchantDisplayName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lh20/z;->a:Lec3/r1;

    iput-object p3, p0, Lh20/z;->b:Ljava/lang/String;

    iput-object p4, p0, Lh20/z;->c:Le30/a;

    iput-object p5, p0, Lh20/z;->d:Le30/a;

    const/4 p2, 0x0

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p3

    iput-object p3, p0, Lh20/z;->e:Lec3/h2;

    iput-object p3, p0, Lh20/z;->f:Lec3/h2;

    new-instance p3, La20/b;

    const/16 p4, 0x1a

    invoke-direct {p3, p0, p2, p4}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 p4, 0x3

    invoke-static {p1, p2, p2, p3, p4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public final a(Lzy/c;Z)V
    .locals 1

    if-eqz p1, :cond_2

    new-instance v0, Lq20/b;

    if-nez p2, :cond_1

    iget-object p2, p0, Lh20/z;->c:Le30/a;

    invoke-virtual {p2}, Le30/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p2, 0x1

    :goto_1
    invoke-direct {v0, p1, p2}, Lq20/b;-><init>(Lzy/c;Z)V

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    iget-object p1, p0, Lh20/z;->e:Lec3/h2;

    invoke-virtual {p1, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void
.end method
