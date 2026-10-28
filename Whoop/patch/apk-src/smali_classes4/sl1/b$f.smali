.class public final Lsl1/b$f;
.super Lsl1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsl1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lsl1/b$f;",
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
.field public static final o:Lsl1/b$f;

.field public static final p:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsl1/b$f;

    invoke-direct {v0}, Lsl1/b$f;-><init>()V

    sput-object v0, Lsl1/b$f;->o:Lsl1/b$f;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lsl1/b$f;->p:I

    return-void
.end method

.method private constructor <init>()V
    .locals 16

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const/16 v14, 0xffe

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v15}, Lsl1/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/b;La11/c;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
