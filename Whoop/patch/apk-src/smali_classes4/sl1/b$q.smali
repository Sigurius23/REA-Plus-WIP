.class public final Lsl1/b$q;
.super Lsl1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsl1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "q"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lsl1/b$q;",
        "Lsl1/b;",
        "<init>",
        "()V",
        "connectivity-common-ui_release"
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
.field public static final o:Lsl1/b$q;

.field public static final p:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsl1/b$q;

    invoke-direct {v0}, Lsl1/b$q;-><init>()V

    sput-object v0, Lsl1/b$q;->o:Lsl1/b$q;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lsl1/b$q;->p:I

    return-void
.end method

.method private constructor <init>()V
    .locals 17

    sget v0, Los0/h;->w:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    sget v0, Los0/h;->v:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->n()Lgz0/g0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/g0;->b()I

    move-result v0

    sget-object v13, La11/c;->ARROW:La11/c;

    sget-object v12, La11/b;->PAIR_STRAP:La11/b;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v15, 0x13f4

    const/16 v16, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v16}, Lsl1/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/b;La11/c;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
