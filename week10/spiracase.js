

function spinalcase(str) {
    var spinal = str.replace(/(?!^)([A-Z])/g, ' $1')
                  .replace(/[_\s]+(?=[a-zA-Z])/g, '-').toLowerCase();
    return spinal 
  }

  console.log(spinalcase('AllThe-small Things'))