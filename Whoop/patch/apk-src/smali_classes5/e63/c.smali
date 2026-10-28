.class public final Le63/c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Le63/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le63/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Le63/c;->w:Le63/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    return-object v0
.end method
