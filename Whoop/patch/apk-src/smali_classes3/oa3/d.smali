.class public final Loa3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/HashMap;

.field public final b:Ljava/util/HashMap;

.field public final c:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loa3/d;->a:Ljava/util/HashMap;

    iput-object p2, p0, Loa3/d;->b:Ljava/util/HashMap;

    iput-object p3, p0, Loa3/d;->c:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Loa3/d;->a:Ljava/util/HashMap;

    return-object v0
.end method
