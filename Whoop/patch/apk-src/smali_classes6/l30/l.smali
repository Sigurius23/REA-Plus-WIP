.class public final Ll30/l;
.super Ll30/m;
.source "SourceFile"


# static fields
.field public static final b:Ll30/o;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ll30/o;

    const-string v1, "The OS or the OS version is not supported."

    sget-object v2, Ll30/n;->x:Ll30/n;

    const-string v3, "SW05"

    invoke-direct {v0, v3, v1, v2}, Ll30/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ll30/n;)V

    sput-object v0, Ll30/l;->b:Ll30/o;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
