.class public abstract Le81/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0004\"\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "",
        "",
        "a",
        "Ljava/util/List;",
        "BIOMARKER_NAMES",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 15

    const-string v13, "HDL Cholesterol"

    const-string v14, "LDL Cholesterol"

    const-string v0, "Glucose"

    const-string v1, "Total Protein"

    const-string v2, "Albumin"

    const-string v3, "Carbon Dioxide"

    const-string v4, "Calcium"

    const-string v5, "Sodium"

    const-string v6, "Potassium"

    const-string v7, "Chloride"

    const-string v8, "Creatinine"

    const-string v9, "Ferritin"

    const-string v10, "Vitamin D"

    const-string v11, "Magnesium"

    const-string v12, "hsCRP"

    filled-new-array/range {v0 .. v14}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Le81/c;->a:Ljava/util/List;

    return-void
.end method

.method public static final synthetic a()Ljava/util/List;
    .locals 1

    sget-object v0, Le81/c;->a:Ljava/util/List;

    return-object v0
.end method
