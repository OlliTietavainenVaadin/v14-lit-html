import {LitElement, html, customElement, property} from 'lit-element';

@customElement('my-component')
export class MyComponent extends LitElement {
  @property()
  name: string = "World"

  @property()
  value: number  = 0;

  render() {
    return html`
        <div>
            <div>
                Hello ${name}! 
            </div>
            <button @click=${this.myListener}>You have clicked ${this.value} times</button>
        </div>
`;
  }

  myListener() {
    // "(this as any)" needed instead of just "this" because
    // TypeScript doesn't know the type automagically
    (this as any).$server.myMethod(this.value);
  }

}
