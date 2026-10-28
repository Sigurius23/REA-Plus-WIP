.class public final Lpg/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Log/j;


# static fields
.field public static final a:Lpg/e;

.field public static final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpg/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lpg/e;->a:Lpg/e;

    :try_start_0
    const-string v0, "version_check"

    invoke-static {v0}, Lfg3/d;->c(Ljava/lang/String;)Lfg3/b;

    move-result-object v0

    const/4 v1, 0x4

    invoke-interface {v0, v1}, Lfg3/b;->g(I)Lig3/a;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    const-class v0, Lpg/e;

    invoke-static {v0}, Lfg3/d;->b(Ljava/lang/Class;)Lfg3/b;

    move-result-object v0

    const-string v1, "falling back to SLF4J 1.x compatible binding"

    invoke-interface {v0, v1}, Lfg3/b;->warn(Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lpg/e;->b:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Log/g;
    .locals 1

    invoke-static {p1}, Lfg3/d;->c(Ljava/lang/String;)Lfg3/b;

    move-result-object p1

    sget-boolean v0, Lpg/e;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Lpg/d;

    invoke-direct {v0, p1}, Lpg/d;-><init>(Lfg3/b;)V

    return-object v0

    :cond_0
    new-instance v0, Lpg/a;

    invoke-direct {v0, p1}, Lpg/a;-><init>(Lfg3/b;)V

    return-object v0
.end method
