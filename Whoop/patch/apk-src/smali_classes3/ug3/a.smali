.class public final Lug3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpg3/n;


# static fields
.field public static final w:Lug3/a;

.field public static final x:Lud3/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lug3/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lug3/a;->w:Lug3/a;

    sget-object v0, Lud3/h0;->e:Lyb3/p;

    const-string v0, "text/plain; charset=UTF-8"

    invoke-static {v0}, Landroidx/room/c1;->u(Ljava/lang/String;)Lud3/h0;

    move-result-object v0

    sput-object v0, Lug3/a;->x:Lud3/h0;

    return-void
.end method


# virtual methods
.method public final convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lug3/a;->x:Lud3/h0;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lud3/v0;->create(Lud3/h0;Ljava/lang/String;)Lud3/v0;

    move-result-object p1

    return-object p1
.end method
