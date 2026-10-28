.class public final Lwi/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lwi/g;


# instance fields
.field public final a:La0/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwi/g;

    invoke-direct {v0}, Lwi/g;-><init>()V

    sput-object v0, Lwi/g;->b:Lwi/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La0/a0;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, La0/a0;-><init>(I)V

    iput-object v0, p0, Lwi/g;->a:La0/a0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lqi/i;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lwi/g;->a:La0/a0;

    invoke-virtual {v0, p1}, La0/a0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lqi/i;

    return-object p1
.end method
