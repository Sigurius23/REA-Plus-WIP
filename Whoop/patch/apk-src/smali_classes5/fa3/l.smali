.class public final Lfa3/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lfa3/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfa3/l;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lfa3/l;->a:Lfa3/l;

    return-void
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lfa3/c0;
    .locals 1

    sget-object v0, Lfa3/g0;->a:Ljava/util/ArrayList;

    new-instance v0, Lfa3/c0;

    invoke-static {p1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p1

    invoke-direct {v0, p0, p1, p2, p3}, Lfa3/c0;-><init>(Ljava/lang/String;Lva3/h;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
