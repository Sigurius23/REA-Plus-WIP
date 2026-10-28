.class public final synthetic Lcom/whoop/domain/model/UnitSystemExtKt$EntriesMappings;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/domain/model/UnitSystemExtKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "EntriesMappings"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic entries$0:Lt83/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt83/a;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/whoop/domain/model/UnitSystem;->values()[Lcom/whoop/domain/model/UnitSystem;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/domain/model/UnitSystemExtKt$EntriesMappings;->entries$0:Lt83/a;

    return-void
.end method
