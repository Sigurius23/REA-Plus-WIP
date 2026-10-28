.class public final Ljc/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/io/Serializable;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lic/b;Lsc/b;Lpc/a;Landroidx/work/impl/WorkDatabase;Lqc/q;Ljava/util/ArrayList;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "foregroundProcessor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p2, p0, Ljc/b0;->a:Ljava/lang/Object;

    .line 12
    iput-object p3, p0, Ljc/b0;->b:Ljava/lang/Object;

    .line 13
    iput-object p4, p0, Ljc/b0;->c:Ljava/lang/Object;

    .line 14
    iput-object p5, p0, Ljc/b0;->d:Ljava/lang/Object;

    .line 15
    iput-object p6, p0, Ljc/b0;->e:Ljava/lang/Object;

    .line 16
    iput-object p7, p0, Ljc/b0;->f:Ljava/io/Serializable;

    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "getApplicationContext(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ljc/b0;->g:Ljava/lang/Object;

    .line 18
    new-instance p1, La3/p;

    const/4 p2, 0x7

    invoke-direct {p1, p2}, La3/p;-><init>(I)V

    iput-object p1, p0, Ljc/b0;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lvg/g;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    new-instance v0, Lvb1/a;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lvb1/a;-><init>(I)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Ljc/b0;->a:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Ljc/b0;->b:Ljava/lang/Object;

    .line 5
    iput-object v0, p0, Ljc/b0;->c:Ljava/lang/Object;

    .line 6
    new-instance p2, Lvb1/a;

    const/4 v0, 0x3

    invoke-direct {p2, v0}, Lvb1/a;-><init>(I)V

    iput-object p2, p0, Ljc/b0;->d:Ljava/lang/Object;

    .line 7
    iput-object p1, p0, Ljc/b0;->e:Ljava/lang/Object;

    .line 8
    sget-object p1, Lvg/p;->w:Lvg/p;

    iput-object p1, p0, Ljc/b0;->f:Ljava/io/Serializable;

    .line 9
    new-instance p1, Lvg/e;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lvg/e;-><init>(Ljc/b0;I)V

    iput-object p1, p0, Ljc/b0;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ljc/b0;->f:Ljava/io/Serializable;

    check-cast v0, Lvg/p;

    sget-object v1, Lvg/f;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, Lvg/p;->x:Lvg/p;

    goto :goto_0

    :cond_0
    sget-object v0, Lvg/p;->z:Lvg/p;

    :goto_0
    iput-object v0, p0, Ljc/b0;->f:Ljava/io/Serializable;

    iput-object p1, p0, Ljc/b0;->h:Ljava/lang/Object;

    if-nez p1, :cond_1

    iget-object v0, p0, Ljc/b0;->a:Ljava/lang/Object;

    check-cast v0, Lvg/g;

    iput-object v0, p0, Ljc/b0;->e:Ljava/lang/Object;

    new-instance v0, Lsc0/c;

    const/16 v1, 0x1c

    invoke-direct {v0, p0, v1}, Lsc0/c;-><init>(Ljava/lang/Object;I)V

    goto :goto_1

    :cond_1
    new-instance v0, Lm83/p;

    const/16 v1, 0x12

    invoke-direct {v0, p1, v1}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    :goto_1
    iput-object v0, p0, Ljc/b0;->g:Ljava/lang/Object;

    if-eqz p1, :cond_2

    iget-object v0, p0, Ljc/b0;->b:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    new-instance p1, Lve0/d;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Lve0/d;-><init>(I)V

    :goto_2
    iput-object p1, p0, Ljc/b0;->d:Ljava/lang/Object;

    return-void
.end method
