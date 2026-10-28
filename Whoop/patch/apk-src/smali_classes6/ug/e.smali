.class public final Lug/e;
.super Ls2/d;
.source "SourceFile"


# static fields
.field public static final w:Lug/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lug/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lug/e;->w:Lug/e;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "incomplete input"

    return-object v0
.end method
