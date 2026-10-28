.class public final Lgm/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/c;


# static fields
.field public static final a:Lgm/b;

.field public static final b:Llt/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lgm/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lgm/b;->a:Lgm/b;

    new-instance v0, Lot/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lot/a;-><init>(I)V

    const-class v1, Lot/e;

    invoke-static {v1, v0}, Lev/n;->o(Ljava/lang/Class;Lot/a;)Ljava/util/HashMap;

    move-result-object v0

    new-instance v1, Llt/b;

    invoke-static {v0}, Lev/n;->p(Ljava/util/HashMap;)Ljava/util/Map;

    move-result-object v0

    const-string v2, "storageMetrics"

    invoke-direct {v1, v2, v0}, Llt/b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    sput-object v1, Lgm/b;->b:Llt/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljm/b;

    check-cast p2, Llt/d;

    sget-object v0, Lgm/b;->b:Llt/b;

    iget-object p1, p1, Ljm/b;->a:Ljm/f;

    invoke-interface {p2, v0, p1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    return-void
.end method
