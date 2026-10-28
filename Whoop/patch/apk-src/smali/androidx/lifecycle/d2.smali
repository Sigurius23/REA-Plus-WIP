.class public final Landroidx/lifecycle/d2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lio/sentry/hints/j;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/sentry/hints/j;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lio/sentry/hints/j;-><init>(I)V

    sput-object v0, Landroidx/lifecycle/d2;->b:Lio/sentry/hints/j;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/ProcessLifecycleOwner;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Landroidx/lifecycle/d2;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/e2;Landroidx/lifecycle/a2;Ll8/c;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultCreationExtras"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lzt/q;

    invoke-direct {v0, p1, p2, p3}, Lzt/q;-><init>(Landroidx/lifecycle/e2;Landroidx/lifecycle/a2;Ll8/c;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object v0, p0, Landroidx/lifecycle/d2;->a:Ljava/lang/Object;

    return-void
.end method
