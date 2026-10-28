.class public final Ll30/h;
.super Ll30/m;
.source "SourceFile"


# static fields
.field public static final c:Ll30/o;


# instance fields
.field public final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ll30/o;

    const-string v1, "A debugger is attached to the App."

    sget-object v2, Ll30/n;->w:Ll30/n;

    const-string v3, "SW04"

    invoke-direct {v0, v3, v1, v2}, Ll30/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ll30/n;)V

    sput-object v0, Ll30/h;->c:Ll30/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-static {}, Landroid/os/Debug;->isDebuggerConnected()Z

    move-result v0

    sget-object v1, Ll30/h;->c:Ll30/o;

    invoke-direct {p0, v1}, Ll30/m;-><init>(Ll30/o;)V

    iput-boolean v0, p0, Ll30/h;->b:Z

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Ll30/h;->b:Z

    return v0
.end method
