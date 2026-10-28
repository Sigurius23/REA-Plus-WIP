.class public final Lcom/whoop/settings/journalv2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/settings/journalv2/i$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 \u00082\u00020\u0001:\u0001\u0008B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\'\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/whoop/settings/journalv2/i;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/settings/journalv2/d$b;",
        "domainState",
        "",
        "Lm91/u;",
        "a",
        "(Lcom/whoop/settings/journalv2/d$b;)Ljava/util/List;",
        "",
        "isChecked",
        "",
        "cycleId",
        "Ly71/o;",
        "b",
        "(ZJ)Ly71/o;",
        "Lcom/whoop/journal/model/CurrentCycle;",
        "currentCycle",
        "c",
        "(ZJLcom/whoop/journal/model/CurrentCycle;)Ly71/o;",
        "Lcom/whoop/settings/journalv2/d;",
        "Lcom/whoop/settings/journalv2/h;",
        "d",
        "(Lcom/whoop/settings/journalv2/d;)Lcom/whoop/settings/journalv2/h;",
        "settings_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lcom/whoop/settings/journalv2/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/settings/journalv2/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/settings/journalv2/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/settings/journalv2/i;->a:Lcom/whoop/settings/journalv2/i$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Lcom/whoop/settings/journalv2/d$b;)Ljava/util/List;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/settings/journalv2/d$b;",
            ")",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    new-instance v1, Lm91/c0;

    const/4 v2, 0x2

    int-to-float v3, v2

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-direct {v1, v5, v3, v6, v7}, Lm91/c0;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/settings/journalv2/d$b;->b()Z

    move-result v3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/settings/journalv2/d$b;->a()Ljava/lang/Long;

    move-result-object v8

    const-wide/16 v9, -0x1

    if-eqz v8, :cond_0

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    goto :goto_0

    :cond_0
    move-wide v11, v9

    :goto_0
    invoke-direct {v0, v3, v11, v12}, Lcom/whoop/settings/journalv2/i;->b(ZJ)Ly71/o;

    move-result-object v3

    new-instance v8, Lm91/c0;

    int-to-float v11, v6

    mul-float/2addr v11, v4

    invoke-direct {v8, v5, v11, v6, v7}, Lm91/c0;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/settings/journalv2/d$b;->b()Z

    move-result v4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/settings/journalv2/d$b;->a()Ljava/lang/Long;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    :cond_1
    new-instance v11, Lcom/whoop/journal/model/CurrentCycle;

    const/16 v20, 0xf

    const/16 v21, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    invoke-direct/range {v11 .. v21}, Lcom/whoop/journal/model/CurrentCycle;-><init>(JJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v4, v9, v10, v11}, Lcom/whoop/settings/journalv2/i;->c(ZJLcom/whoop/journal/model/CurrentCycle;)Ly71/o;

    move-result-object v4

    const/4 v5, 0x4

    new-array v5, v5, [Lm91/u;

    const/4 v7, 0x0

    aput-object v1, v5, v7

    aput-object v3, v5, v6

    aput-object v8, v5, v2

    const/4 v1, 0x3

    aput-object v4, v5, v1

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    return-object v1
.end method

.method private final b(ZJ)Ly71/o;
    .locals 27

    sget-object v1, Ly71/o;->p:Ly71/o$c;

    new-instance v2, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lea2/s;->i:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v2, v0, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/w;->w()I

    move-result v0

    new-instance v5, Lcom/whoop/design/util/TextResource$b;

    sget v6, Lea2/s;->i:I

    invoke-direct {v5, v6, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v7, v0, v5}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    new-instance v0, Lcom/whoop/settings/journalv2/c$a;

    move-wide/from16 v3, p2

    invoke-direct {v0, v3, v4}, Lcom/whoop/settings/journalv2/c$a;-><init>(J)V

    const v25, 0x6fbfde

    const/16 v26, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move/from16 v16, p1

    move-object/from16 v22, v0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v0

    return-object v0
.end method

.method private final c(ZJLcom/whoop/journal/model/CurrentCycle;)Ly71/o;
    .locals 27

    sget-object v1, Ly71/o;->p:Ly71/o$c;

    new-instance v2, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lea2/s;->N0:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v2, v0, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/a;->k()I

    move-result v0

    new-instance v5, Lcom/whoop/design/util/TextResource$b;

    sget v6, Lea2/s;->N0:I

    invoke-direct {v5, v6, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v7, v0, v5}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    new-instance v0, Lcom/whoop/settings/journalv2/c$b;

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    invoke-direct {v0, v3, v4, v5}, Lcom/whoop/settings/journalv2/c$b;-><init>(JLcom/whoop/journal/model/CurrentCycle;)V

    const v25, 0x6fbfde

    const/16 v26, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move/from16 v16, p1

    move-object/from16 v22, v0

    invoke-static/range {v1 .. v26}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final d(Lcom/whoop/settings/journalv2/d;)Lcom/whoop/settings/journalv2/h;
    .locals 3

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/settings/journalv2/d$b;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/whoop/settings/journalv2/h$e;

    check-cast p1, Lcom/whoop/settings/journalv2/d$b;

    invoke-virtual {p1}, Lcom/whoop/settings/journalv2/d$b;->b()Z

    move-result v1

    invoke-virtual {p1}, Lcom/whoop/settings/journalv2/d$b;->c()Z

    move-result v2

    invoke-direct {p0, p1}, Lcom/whoop/settings/journalv2/i;->a(Lcom/whoop/settings/journalv2/d$b;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lcom/whoop/settings/journalv2/h$e;-><init>(ZZLjava/util/List;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lcom/whoop/settings/journalv2/d$a;

    if-eqz v0, :cond_1

    sget-object p1, Lcom/whoop/settings/journalv2/h$a;->a:Lcom/whoop/settings/journalv2/h$a;

    return-object p1

    :cond_1
    instance-of v0, p1, Lcom/whoop/settings/journalv2/d$d;

    if-eqz v0, :cond_2

    sget-object p1, Lcom/whoop/settings/journalv2/h$d;->a:Lcom/whoop/settings/journalv2/h$d;

    return-object p1

    :cond_2
    instance-of p1, p1, Lcom/whoop/settings/journalv2/d$c;

    if-eqz p1, :cond_3

    sget-object p1, Lcom/whoop/settings/journalv2/h$c;->a:Lcom/whoop/settings/journalv2/h$c;

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
