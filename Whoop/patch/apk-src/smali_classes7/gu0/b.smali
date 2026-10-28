.class public final Lgu0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgu0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0018\u0000 \u000c2\u00020\u0001:\u0001\u000cB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lgu0/b;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;",
        "metadata",
        "",
        "d",
        "(Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;)Ljava/lang/String;",
        "json",
        "b",
        "(Ljava/lang/String;)Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;",
        "a",
        "connectivity-data-packets-model_release"
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
.field private static final a:Lgu0/b$a;

.field private static final b:Lad3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgu0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgu0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lgu0/b;->a:Lgu0/b$a;

    new-instance v0, Lgo1/a;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lgo1/a;-><init>(I)V

    sget-object v1, Lad3/c;->d:Lad3/b;

    invoke-static {v1, v0}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object v0

    sput-object v0, Lgu0/b;->b:Lad3/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lad3/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lgu0/b;->c(Lad3/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lad3/g;)Ll83/a0;
    .locals 1

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lad3/g;->c:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;
    .locals 2

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lgu0/b;->b:Lad3/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;->Companion:Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata$a;

    invoke-virtual {v1}, Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata$a;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {v0, v1, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;

    return-object p1
.end method

.method public final d(Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;)Ljava/lang/String;
    .locals 2

    const-string v0, "metadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lgu0/b;->b:Lad3/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;->Companion:Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata$a;

    invoke-virtual {v1}, Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata$a;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/j;

    invoke-virtual {v0, v1, p1}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
