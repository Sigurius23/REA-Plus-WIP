.class public final Lrc/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lsc/b;

.field public final b:Lpc/a;

.field public final c:Lqc/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WMFgUpdater"

    invoke-static {v0}, Lic/w;->f(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;Lpc/a;Lsc/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lrc/m;->b:Lpc/a;

    iput-object p3, p0, Lrc/m;->a:Lsc/b;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object p1

    iput-object p1, p0, Lrc/m;->c:Lqc/u;

    return-void
.end method
