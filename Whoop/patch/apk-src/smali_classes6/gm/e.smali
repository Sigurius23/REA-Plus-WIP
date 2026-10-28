.class public final Lgm/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/c;


# static fields
.field public static final a:Lgm/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgm/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lgm/e;->a:Lgm/e;

    const-string v0, "clientMetrics"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p1}, Lnh3/a;->d(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1
.end method
