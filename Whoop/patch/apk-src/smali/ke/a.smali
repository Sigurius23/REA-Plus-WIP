.class public final Lke/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lgf/a;


# instance fields
.field public final a:Ljava/util/LinkedHashMap;

.field public final b:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgf/a;

    const-string v1, "CustomUserAgentMetadata"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lke/a;->c:Lgf/a;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Ljava/util/List;)V
    .locals 1

    const-string v0, "extras"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typedExtras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Lke/a;->a:Ljava/util/LinkedHashMap;

    check-cast p2, Ljava/util/Collection;

    invoke-static {p2}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lke/a;->b:Ljava/util/ArrayList;

    return-void
.end method
