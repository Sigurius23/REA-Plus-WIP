.class public final Lig3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lig3/a;


# static fields
.field public static final w:Lig3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lig3/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lig3/c;->w:Lig3/c;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lig3/a;
    .locals 0

    sget-object p1, Lig3/c;->w:Lig3/c;

    return-object p1
.end method

.method public final b()V
    .locals 0

    return-void
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/String;)Lig3/a;
    .locals 0

    sget-object p1, Lig3/c;->w:Lig3/c;

    return-object p1
.end method

.method public final g(Lpg/c;)Lig3/a;
    .locals 0

    return-object p0
.end method
