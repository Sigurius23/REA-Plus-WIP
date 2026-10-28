.class public final Lcom/whoop/strapMetadata/util/DataStorePreferenceKeys;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/strapMetadata/util/DataStorePreferenceKeys;",
        "",
        "<init>",
        "()V",
        "Lf6/d;",
        "",
        "PREF_AUXILIARY_DEVICE_ID",
        "Lf6/d;",
        "getPREF_AUXILIARY_DEVICE_ID",
        "()Lf6/d;",
        "strap-metadata_release"
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
.field public static final INSTANCE:Lcom/whoop/strapMetadata/util/DataStorePreferenceKeys;

.field private static final PREF_AUXILIARY_DEVICE_ID:Lf6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/d;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/strapMetadata/util/DataStorePreferenceKeys;

    invoke-direct {v0}, Lcom/whoop/strapMetadata/util/DataStorePreferenceKeys;-><init>()V

    sput-object v0, Lcom/whoop/strapMetadata/util/DataStorePreferenceKeys;->INSTANCE:Lcom/whoop/strapMetadata/util/DataStorePreferenceKeys;

    const-string v0, "auxiliary_serial_id"

    invoke-static {v0}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Lcom/whoop/strapMetadata/util/DataStorePreferenceKeys;->PREF_AUXILIARY_DEVICE_ID:Lf6/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getPREF_AUXILIARY_DEVICE_ID()Lf6/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lf6/d;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/strapMetadata/util/DataStorePreferenceKeys;->PREF_AUXILIARY_DEVICE_ID:Lf6/d;

    return-object v0
.end method
