.class public abstract Lqc3/a1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll83/p;

.field public static final b:Ll83/p;

.field public static final c:Ll83/p;

.field public static final d:Lqc3/v;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqa1/a;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lqa1/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lqc3/a1;->a:Ll83/p;

    new-instance v0, Lqa1/a;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lqa1/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lqc3/a1;->b:Ll83/p;

    new-instance v0, Lqa1/a;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lqa1/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lqc3/a1;->c:Ll83/p;

    new-instance v0, Lqc3/v;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, v1}, Lqc3/v;-><init>(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    sput-object v0, Lqc3/a1;->d:Lqc3/v;

    return-void
.end method
