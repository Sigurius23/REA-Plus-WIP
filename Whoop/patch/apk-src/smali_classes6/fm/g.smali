.class public final Lfm/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/c;


# static fields
.field public static final a:Lfm/g;

.field public static final b:Llt/b;

.field public static final c:Llt/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfm/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lfm/g;->a:Lfm/g;

    const-string v0, "networkType"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/g;->b:Llt/b;

    const-string v0, "mobileSubtype"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/g;->c:Llt/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lfm/v;

    check-cast p2, Llt/d;

    check-cast p1, Lfm/n;

    iget-object v0, p1, Lfm/n;->a:Lfm/u;

    sget-object v1, Lfm/g;->b:Llt/b;

    invoke-interface {p2, v1, v0}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    sget-object v0, Lfm/g;->c:Llt/b;

    iget-object p1, p1, Lfm/n;->b:Lfm/t;

    invoke-interface {p2, v0, p1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    return-void
.end method
