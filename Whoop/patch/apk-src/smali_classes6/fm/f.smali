.class public final Lfm/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/c;


# static fields
.field public static final a:Lfm/f;

.field public static final b:Llt/b;

.field public static final c:Llt/b;

.field public static final d:Llt/b;

.field public static final e:Llt/b;

.field public static final f:Llt/b;

.field public static final g:Llt/b;

.field public static final h:Llt/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfm/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lfm/f;->a:Lfm/f;

    const-string v0, "requestTimeMs"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/f;->b:Llt/b;

    const-string v0, "requestUptimeMs"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/f;->c:Llt/b;

    const-string v0, "clientInfo"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/f;->d:Llt/b;

    const-string v0, "logSource"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/f;->e:Llt/b;

    const-string v0, "logSourceName"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/f;->f:Llt/b;

    const-string v0, "logEvent"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/f;->g:Llt/b;

    const-string v0, "qosTier"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/f;->h:Llt/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lfm/s;

    check-cast p2, Llt/d;

    check-cast p1, Lfm/l;

    iget-wide v0, p1, Lfm/l;->a:J

    sget-object v2, Lfm/f;->b:Llt/b;

    invoke-interface {p2, v2, v0, v1}, Llt/d;->a(Llt/b;J)Llt/d;

    sget-object v0, Lfm/f;->c:Llt/b;

    iget-wide v1, p1, Lfm/l;->b:J

    invoke-interface {p2, v0, v1, v2}, Llt/d;->a(Llt/b;J)Llt/d;

    sget-object v0, Lfm/f;->d:Llt/b;

    iget-object v1, p1, Lfm/l;->c:Lfm/j;

    invoke-interface {p2, v0, v1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    sget-object v0, Lfm/f;->e:Llt/b;

    iget-object v1, p1, Lfm/l;->d:Ljava/lang/Integer;

    invoke-interface {p2, v0, v1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    sget-object v0, Lfm/f;->f:Llt/b;

    iget-object v1, p1, Lfm/l;->e:Ljava/lang/String;

    invoke-interface {p2, v0, v1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    sget-object v0, Lfm/f;->g:Llt/b;

    iget-object p1, p1, Lfm/l;->f:Ljava/util/ArrayList;

    invoke-interface {p2, v0, p1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    sget-object p1, Lfm/f;->h:Llt/b;

    sget-object v0, Lfm/w;->w:Lfm/w;

    invoke-interface {p2, p1, v0}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    return-void
.end method
