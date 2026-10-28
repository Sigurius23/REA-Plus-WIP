.class public final Ll8/e;
.super Ll8/c;
.source "SourceFile"


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 6
    sget-object p1, Ll8/a;->b:Ll8/a;

    .line 7
    invoke-direct {p0, p1}, Ll8/e;-><init>(Ll8/c;)V

    return-void
.end method

.method public constructor <init>(Ll8/c;)V
    .locals 1

    const-string v0, "initialExtras"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p1, Ll8/c;->a:Ljava/util/LinkedHashMap;

    .line 2
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ll8/c;-><init>()V

    .line 4
    iget-object v0, p0, Ll8/c;->a:Ljava/util/LinkedHashMap;

    .line 5
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final a(Ll8/b;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll8/c;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
