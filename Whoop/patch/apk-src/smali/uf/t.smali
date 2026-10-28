.class public final Luf/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final n:Luf/t;


# instance fields
.field public final a:Lmg/h;

.field public final b:Lqg/c;

.field public final c:Lqg/d;

.field public final d:Lqg/d;

.field public final e:Lqg/c;

.field public final f:Lqg/c;

.field public final g:Lqg/c;

.field public final h:Lqg/c;

.field public final i:Lqg/c;

.field public final j:Lqg/c;

.field public final k:Lqg/c;

.field public final l:Lqg/c;

.field public final m:Lqg/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Luf/t;

    sget-object v1, Lmg/h;->a:Lmg/g;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lmg/g;->b:Lmg/f;

    const-string v2, "NoOp"

    invoke-direct {v0, v2, v1}, Luf/t;-><init>(Ljava/lang/String;Lmg/h;)V

    sput-object v0, Luf/t;->n:Luf/t;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lmg/h;)V
    .locals 0

    const-string p1, "provider"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Luf/t;->a:Lmg/h;

    invoke-interface {p2}, Lmg/h;->a()Lqg/g;

    move-result-object p1

    check-cast p1, Lqg/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lqg/d;->a:Lqg/c;

    iput-object p1, p0, Luf/t;->b:Lqg/c;

    sget-object p2, Lqg/h;->a:Lqg/d;

    iput-object p2, p0, Luf/t;->c:Lqg/d;

    iput-object p2, p0, Luf/t;->d:Lqg/d;

    iput-object p1, p0, Luf/t;->e:Lqg/c;

    iput-object p1, p0, Luf/t;->f:Lqg/c;

    iput-object p1, p0, Luf/t;->g:Lqg/c;

    iput-object p1, p0, Luf/t;->h:Lqg/c;

    iput-object p1, p0, Luf/t;->i:Lqg/c;

    iput-object p1, p0, Luf/t;->j:Lqg/c;

    iput-object p1, p0, Luf/t;->k:Lqg/c;

    iput-object p1, p0, Luf/t;->l:Lqg/c;

    iput-object p1, p0, Luf/t;->m:Lqg/c;

    return-void
.end method
