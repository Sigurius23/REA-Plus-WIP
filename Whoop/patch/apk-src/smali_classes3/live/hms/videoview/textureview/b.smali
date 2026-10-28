.class public final synthetic Llive/hms/videoview/textureview/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:Llive/hms/videoview/textureview/HMSTextureRenderer;

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Llive/hms/videoview/textureview/HMSTextureRenderer;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/videoview/textureview/b;->w:Llive/hms/videoview/textureview/HMSTextureRenderer;

    iput p2, p0, Llive/hms/videoview/textureview/b;->x:I

    iput p3, p0, Llive/hms/videoview/textureview/b;->y:I

    iput p4, p0, Llive/hms/videoview/textureview/b;->z:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Llive/hms/videoview/textureview/b;->y:I

    iget v1, p0, Llive/hms/videoview/textureview/b;->z:I

    iget-object v2, p0, Llive/hms/videoview/textureview/b;->w:Llive/hms/videoview/textureview/HMSTextureRenderer;

    iget v3, p0, Llive/hms/videoview/textureview/b;->x:I

    invoke-static {v2, v3, v0, v1}, Llive/hms/videoview/textureview/HMSTextureRenderer$init$1$1;->a(Llive/hms/videoview/textureview/HMSTextureRenderer;III)V

    return-void
.end method
