.class public final Lfm/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/c;


# static fields
.field public static final a:Lfm/d;

.field public static final b:Llt/b;

.field public static final c:Llt/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfm/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lfm/d;->a:Lfm/d;

    const-string v0, "clientType"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/d;->b:Llt/b;

    const-string v0, "androidClientInfo"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/d;->c:Llt/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lfm/q;

    check-cast p2, Llt/d;

    check-cast p1, Lfm/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lfm/p;->w:Lfm/p;

    sget-object v1, Lfm/d;->b:Llt/b;

    invoke-interface {p2, v1, v0}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    sget-object v0, Lfm/d;->c:Llt/b;

    iget-object p1, p1, Lfm/j;->a:Lfm/h;

    invoke-interface {p2, v0, p1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    return-void
.end method
