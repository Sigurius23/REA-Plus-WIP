.class public final Lnj0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0006\u001a\u0004\u0008\u0005\u0010\u0008R\u0017\u0010\r\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0006\u001a\u0004\u0008\u000c\u0010\u0008R\u0017\u0010\u000f\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0006\u001a\u0004\u0008\n\u0010\u0008\u00a8\u0006\u0010"
    }
    d2 = {
        "Lnj0/d;",
        "",
        "<init>",
        "()V",
        "Lnj0/b;",
        "b",
        "Lnj0/b;",
        "a",
        "()Lnj0/b;",
        "Harvard",
        "c",
        "Maverick",
        "d",
        "Symphony",
        "e",
        "Monument",
        "whoop-ble-api"
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
.field public static final a:Lnj0/d;

.field private static final b:Lnj0/b;

.field private static final c:Lnj0/b;

.field private static final d:Lnj0/b;

.field private static final e:Lnj0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lnj0/d;

    invoke-direct {v0}, Lnj0/d;-><init>()V

    sput-object v0, Lnj0/d;->a:Lnj0/d;

    new-instance v0, Lnj0/b;

    sget-object v1, Lnj0/c;->CmdToStrap:Lnj0/c;

    const-string v2, "61080002-8d6d-82b8-614a-1c8cb0f8dcc6"

    invoke-static {v2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lnj0/c;->CmdFromStrap:Lnj0/c;

    const-string v4, "61080003-8d6d-82b8-614a-1c8cb0f8dcc6"

    invoke-static {v4}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v4

    new-instance v5, Ll83/k;

    invoke-direct {v5, v2, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v4, Lnj0/c;->EventsFromStrap:Lnj0/c;

    const-string v6, "61080004-8d6d-82b8-614a-1c8cb0f8dcc6"

    invoke-static {v6}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v6

    new-instance v7, Ll83/k;

    invoke-direct {v7, v4, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v6, Lnj0/c;->DataFromStrap:Lnj0/c;

    const-string v8, "61080005-8d6d-82b8-614a-1c8cb0f8dcc6"

    invoke-static {v8}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v8

    new-instance v9, Ll83/k;

    invoke-direct {v9, v6, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v8, Lnj0/c;->MemFault:Lnj0/c;

    const-string v10, "61080007-8d6d-82b8-614a-1c8cb0f8dcc6"

    invoke-static {v10}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v10

    new-instance v11, Ll83/k;

    invoke-direct {v11, v8, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v5, v7, v9, v11}, [Ll83/k;

    move-result-object v3

    invoke-static {v3}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v3

    invoke-direct {v0, v3}, Lnj0/b;-><init>(Ljava/util/Map;)V

    sput-object v0, Lnj0/d;->b:Lnj0/b;

    new-instance v0, Lnj0/b;

    const-string v3, "fd4b0002-cce1-4033-93ce-002d5875f58a"

    invoke-static {v3}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v3

    new-instance v5, Ll83/k;

    invoke-direct {v5, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "fd4b0003-cce1-4033-93ce-002d5875f58a"

    invoke-static {v3}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v3

    new-instance v7, Ll83/k;

    invoke-direct {v7, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "fd4b0004-cce1-4033-93ce-002d5875f58a"

    invoke-static {v3}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v3

    new-instance v9, Ll83/k;

    invoke-direct {v9, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "fd4b0005-cce1-4033-93ce-002d5875f58a"

    invoke-static {v3}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v3

    new-instance v10, Ll83/k;

    invoke-direct {v10, v6, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "fd4b0007-cce1-4033-93ce-002d5875f58a"

    invoke-static {v3}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v3

    new-instance v11, Ll83/k;

    invoke-direct {v11, v8, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v7, v9, v10, v11}, [Ll83/k;

    move-result-object v3

    invoke-static {v3}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v3

    invoke-direct {v0, v3}, Lnj0/b;-><init>(Ljava/util/Map;)V

    sput-object v0, Lnj0/d;->c:Lnj0/b;

    new-instance v0, Lnj0/b;

    const-string v3, "59830002-5955-419b-bb8d-c8262926af23"

    invoke-static {v3}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v3

    new-instance v5, Ll83/k;

    invoke-direct {v5, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "59830003-5955-419b-bb8d-c8262926af23"

    invoke-static {v3}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v3

    new-instance v7, Ll83/k;

    invoke-direct {v7, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "59830004-5955-419b-bb8d-c8262926af23"

    invoke-static {v3}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v3

    new-instance v9, Ll83/k;

    invoke-direct {v9, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "59830005-5955-419b-bb8d-c8262926af23"

    invoke-static {v3}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v3

    new-instance v10, Ll83/k;

    invoke-direct {v10, v6, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "59830007-5955-419b-bb8d-c8262926af23"

    invoke-static {v3}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v3

    new-instance v11, Ll83/k;

    invoke-direct {v11, v8, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v7, v9, v10, v11}, [Ll83/k;

    move-result-object v3

    invoke-static {v3}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v3

    invoke-direct {v0, v3}, Lnj0/b;-><init>(Ljava/util/Map;)V

    sput-object v0, Lnj0/d;->d:Lnj0/b;

    new-instance v0, Lnj0/b;

    const-string v3, "8a580002-2fe8-4796-9267-b87a2b0c8234"

    invoke-static {v3}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v3

    new-instance v5, Ll83/k;

    invoke-direct {v5, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "8a580003-2fe8-4796-9267-b87a2b0c8234"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "8a580004-2fe8-4796-9267-b87a2b0c8234"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "8a580005-2fe8-4796-9267-b87a2b0c8234"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    new-instance v4, Ll83/k;

    invoke-direct {v4, v6, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "8a580007-2fe8-4796-9267-b87a2b0c8234"

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    new-instance v6, Ll83/k;

    invoke-direct {v6, v8, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v3, v2, v4, v6}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Lnj0/b;-><init>(Ljava/util/Map;)V

    sput-object v0, Lnj0/d;->e:Lnj0/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lnj0/b;
    .locals 1

    sget-object v0, Lnj0/d;->b:Lnj0/b;

    return-object v0
.end method

.method public final b()Lnj0/b;
    .locals 1

    sget-object v0, Lnj0/d;->c:Lnj0/b;

    return-object v0
.end method

.method public final c()Lnj0/b;
    .locals 1

    sget-object v0, Lnj0/d;->e:Lnj0/b;

    return-object v0
.end method

.method public final d()Lnj0/b;
    .locals 1

    sget-object v0, Lnj0/d;->d:Lnj0/b;

    return-object v0
.end method
