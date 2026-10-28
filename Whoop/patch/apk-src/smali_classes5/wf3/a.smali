.class public final Lwf3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Lvf3/c;


# instance fields
.field public final a:Lnf3/a;

.field public final b:Ljava/util/HashSet;

.field public final c:Ljava/util/concurrent/ConcurrentHashMap;

.field public final d:Lxf3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvf3/c;

    const-string v1, "_"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lwf3/a;->e:Lvf3/c;

    return-void
.end method

.method public constructor <init>(Lnf3/a;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwf3/a;->a:Lnf3/a;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lwf3/a;->b:Ljava/util/HashSet;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, p0, Lwf3/a;->c:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v2, Lxf3/c;

    const/4 v3, 0x1

    sget-object v4, Lwf3/a;->e:Lvf3/c;

    const-string v5, "_"

    invoke-direct {v2, v4, v5, v3, p1}, Lxf3/c;-><init>(Lvf3/a;Ljava/lang/String;ZLnf3/a;)V

    iput-object v2, p0, Lwf3/a;->d:Lxf3/c;

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v5, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
