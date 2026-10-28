.class public abstract Lqc3/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll83/p;

.field public static final b:Ll83/p;

.field public static final c:Lqc3/s;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqa1/a;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lqa1/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lqc3/z;->a:Ll83/p;

    new-instance v0, Lqa1/a;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lqa1/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lqc3/z;->b:Ll83/p;

    new-instance v0, Lqc3/s;

    invoke-direct {v0}, Lqc3/s;-><init>()V

    sput-object v0, Lqc3/z;->c:Lqc3/s;

    return-void
.end method
