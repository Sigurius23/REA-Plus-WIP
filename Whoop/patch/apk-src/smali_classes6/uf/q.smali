.class public abstract Luf/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Luf/p;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    sget-object v0, Luf/p;->d:Luf/p;

    new-instance v0, Lt9/c0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    new-array v2, v1, [Lnf/e;

    const/4 v3, 0x0

    sget-object v4, Lnf/a;->a:Lnf/a;

    aput-object v4, v2, v3

    new-instance v4, Lty/c;

    const/4 v5, 0x7

    invoke-direct {v4, v2, v5}, Lty/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v5, 0x10

    if-ge v1, v5, :cond_0

    move v1, v5

    :cond_0
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    aget-object v1, v2, v3

    invoke-interface {v1}, Lnf/e;->c()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lue/b;

    invoke-direct {v3, v2}, Lue/b;-><init>(Ljava/lang/String;)V

    invoke-interface {v5, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Luf/p;

    invoke-direct {v1, v4, v5, v0}, Luf/p;-><init>(Luf/c;Ljava/util/Map;Lxf/f;)V

    sput-object v1, Luf/q;->a:Luf/p;

    return-void
.end method
