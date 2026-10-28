.class public final Lnh/b;
.super Ldt/b;
.source "SourceFile"


# static fields
.field public static final a:Lnh/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnh/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lnh/b;->a:Lnh/b;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dimension.Undefined"

    return-object v0
.end method
