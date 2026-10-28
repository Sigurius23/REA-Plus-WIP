.class public final Lgm/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/c;


# static fields
.field public static final a:Lgm/d;

.field public static final b:Llt/b;

.field public static final c:Llt/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lgm/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lgm/d;->a:Lgm/d;

    new-instance v0, Lot/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lot/a;-><init>(I)V

    const-class v1, Lot/e;

    invoke-static {v1, v0}, Lev/n;->o(Ljava/lang/Class;Lot/a;)Ljava/util/HashMap;

    move-result-object v0

    new-instance v2, Llt/b;

    invoke-static {v0}, Lev/n;->p(Ljava/util/HashMap;)Ljava/util/Map;

    move-result-object v0

    const-string v3, "logSource"

    invoke-direct {v2, v3, v0}, Llt/b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    sput-object v2, Lgm/d;->b:Llt/b;

    new-instance v0, Lot/a;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, Lot/a;-><init>(I)V

    invoke-static {v1, v0}, Lev/n;->o(Ljava/lang/Class;Lot/a;)Ljava/util/HashMap;

    move-result-object v0

    new-instance v1, Llt/b;

    invoke-static {v0}, Lev/n;->p(Ljava/util/HashMap;)Ljava/util/Map;

    move-result-object v0

    const-string v2, "logEventDropped"

    invoke-direct {v1, v2, v0}, Llt/b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    sput-object v1, Lgm/d;->c:Llt/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Ljm/e;

    check-cast p2, Llt/d;

    sget-object v0, Lgm/d;->b:Llt/b;

    iget-object v1, p1, Ljm/e;->a:Ljava/lang/String;

    invoke-interface {p2, v0, v1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    sget-object v0, Lgm/d;->c:Llt/b;

    iget-object p1, p1, Ljm/e;->b:Ljava/util/List;

    invoke-interface {p2, v0, p1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    return-void
.end method
