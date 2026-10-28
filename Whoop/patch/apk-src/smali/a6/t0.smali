.class public final La6/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lc93/m;

.field public final b:Lbc3/t;

.field public final c:La6/e1;

.field public final d:Lq83/j;


# direct methods
.method public constructor <init>(Lc93/m;Lbc3/t;La6/e1;Lq83/j;)V
    .locals 1

    const-string v0, "transform"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callerContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La6/t0;->a:Lc93/m;

    iput-object p2, p0, La6/t0;->b:Lbc3/t;

    iput-object p3, p0, La6/t0;->c:La6/e1;

    iput-object p4, p0, La6/t0;->d:Lq83/j;

    return-void
.end method
