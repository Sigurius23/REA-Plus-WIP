.class public final Lre/p;
.super Lre/z;
.source "SourceFile"


# static fields
.field public static final b:Lre/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/p;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lre/p;->b:Lre/p;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "PASSWORD"

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Password"

    return-object v0
.end method
