.class public final Lgm/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/c;


# static fields
.field public static final a:Lgm/g;

.field public static final b:Llt/b;

.field public static final c:Llt/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lgm/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lgm/g;->a:Lgm/g;

    new-instance v0, Lot/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lot/a;-><init>(I)V

    const-class v1, Lot/e;

    invoke-static {v1, v0}, Lev/n;->o(Ljava/lang/Class;Lot/a;)Ljava/util/HashMap;

    move-result-object v0

    new-instance v2, Llt/b;

    invoke-static {v0}, Lev/n;->p(Ljava/util/HashMap;)Ljava/util/Map;

    move-result-object v0

    const-string v3, "startMs"

    invoke-direct {v2, v3, v0}, Llt/b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    sput-object v2, Lgm/g;->b:Llt/b;

    new-instance v0, Lot/a;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, Lot/a;-><init>(I)V

    invoke-static {v1, v0}, Lev/n;->o(Ljava/lang/Class;Lot/a;)Ljava/util/HashMap;

    move-result-object v0

    new-instance v1, Llt/b;

    invoke-static {v0}, Lev/n;->p(Ljava/util/HashMap;)Ljava/util/Map;

    move-result-object v0

    const-string v2, "endMs"

    invoke-direct {v1, v2, v0}, Llt/b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    sput-object v1, Lgm/g;->c:Llt/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Ljm/g;

    check-cast p2, Llt/d;

    sget-object v0, Lgm/g;->b:Llt/b;

    iget-wide v1, p1, Ljm/g;->a:J

    invoke-interface {p2, v0, v1, v2}, Llt/d;->a(Llt/b;J)Llt/d;

    sget-object v0, Lgm/g;->c:Llt/b;

    iget-wide v1, p1, Ljm/g;->b:J

    invoke-interface {p2, v0, v1, v2}, Llt/d;->a(Llt/b;J)Llt/d;

    return-void
.end method
