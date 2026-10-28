.class public final Lz43/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;

.field public final b:Ljava/util/LinkedHashMap;

.field public c:Lkotlin/jvm/internal/m;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lz43/b;->b:Ljava/util/LinkedHashMap;

    sget-object v0, Lz43/a;->w:Lz43/a;

    iput-object v0, p0, Lz43/b;->c:Lkotlin/jvm/internal/m;

    return-void
.end method
