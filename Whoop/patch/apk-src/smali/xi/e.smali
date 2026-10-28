.class public final Lxi/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyi/b;


# instance fields
.field public final a:Lol/b;

.field public final b:Lxi/f;

.field public final c:Lxi/a;

.field public final d:Lxi/b;

.field public final e:Lxi/a;

.field public final f:Lxi/b;

.field public final g:Lxi/b;

.field public final h:Lxi/b;

.field public final i:Lxi/b;

.field public j:Z


# direct methods
.method public constructor <init>()V
    .locals 10

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v9}, Lxi/e;-><init>(Lol/b;Lxi/f;Lxi/a;Lxi/b;Lxi/a;Lxi/b;Lxi/b;Lxi/b;Lxi/b;)V

    return-void
.end method

.method public constructor <init>(Lol/b;Lxi/f;Lxi/a;Lxi/b;Lxi/a;Lxi/b;Lxi/b;Lxi/b;Lxi/b;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lxi/e;->j:Z

    .line 4
    iput-object p1, p0, Lxi/e;->a:Lol/b;

    .line 5
    iput-object p2, p0, Lxi/e;->b:Lxi/f;

    .line 6
    iput-object p3, p0, Lxi/e;->c:Lxi/a;

    .line 7
    iput-object p4, p0, Lxi/e;->d:Lxi/b;

    .line 8
    iput-object p5, p0, Lxi/e;->e:Lxi/a;

    .line 9
    iput-object p6, p0, Lxi/e;->h:Lxi/b;

    .line 10
    iput-object p7, p0, Lxi/e;->i:Lxi/b;

    .line 11
    iput-object p8, p0, Lxi/e;->f:Lxi/b;

    .line 12
    iput-object p9, p0, Lxi/e;->g:Lxi/b;

    return-void
.end method


# virtual methods
.method public final a(Lqi/w;Lqi/i;Lzi/b;)Lsi/c;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
