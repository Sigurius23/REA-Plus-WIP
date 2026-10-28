.class public final synthetic Ljc/w;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/p;


# static fields
.field public static final w:Ljc/w;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ljc/w;

    const-string v4, "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;"

    const/4 v5, 0x1

    const/4 v1, 0x6

    const-class v2, Ljc/x;

    const-string v3, "createSchedulers"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Ljc/w;->w:Ljc/w;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v1, p1

    check-cast v1, Landroid/content/Context;

    move-object v2, p2

    check-cast v2, Lic/b;

    move-object v6, p3

    check-cast v6, Lsc/a;

    check-cast p4, Landroidx/work/impl/WorkDatabase;

    move-object v3, p5

    check-cast v3, Loc/i;

    move-object v4, p6

    check-cast v4, Ljc/g;

    const-string p1, "p0"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "p1"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "p2"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "p3"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "p4"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "p5"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ljc/k;->a:Ljava/lang/String;

    new-instance p1, Llc/c;

    invoke-direct {p1, v1, p4, v2}, Llc/c;-><init>(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Lic/b;)V

    const-class p2, Landroidx/work/impl/background/systemjob/SystemJobService;

    const/4 p3, 0x1

    invoke-static {v1, p2, p3}, Lrc/g;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object p2

    sget-object p4, Ljc/k;->a:Ljava/lang/String;

    const-string p5, "Created SystemJobScheduler and enabled SystemJobService"

    invoke-virtual {p2, p4, p5}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lkc/c;

    new-instance v5, Lcom/google/crypto/tink/internal/l0;

    invoke-direct {v5, v4, v6}, Lcom/google/crypto/tink/internal/l0;-><init>(Ljc/g;Lsc/a;)V

    invoke-direct/range {v0 .. v6}, Lkc/c;-><init>(Landroid/content/Context;Lic/b;Loc/i;Ljc/g;Lcom/google/crypto/tink/internal/l0;Lsc/a;)V

    const/4 p2, 0x2

    new-array p2, p2, [Ljc/i;

    const/4 p4, 0x0

    aput-object p1, p2, p4

    aput-object v0, p2, p3

    invoke-static {p2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
